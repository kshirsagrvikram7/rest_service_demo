package com.vksagar.restservicedemo.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vksagar.restservicedemo.model.Article;

@Transactional
@Repository
public class ArticleDAOImpl implements IArticleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Article> getAllArticles() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Article.class).list();
	}

	@Override
	public Article getArticleById(int articleId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Article.class, articleId);
	}

	@Override
	public void addArticle(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.save(article);
	}

	@Override
	public void updateArticle(Article article) {
		Session session = sessionFactory.getCurrentSession();
		
		Article newArticle = session.get(Article.class, article.getArticleId());
		newArticle.setCategory(article.getCategory());
		newArticle.setTitle(article.getTitle());
		session.update(newArticle);
	}

	@Override
	public void deleteArticle(int articleId) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getArticleById(articleId));
	}

	@Override
	public boolean articleExists(String title, String category) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Article as atcl WHERE atcl.title = :_title AND atcl.category = :_category";
		Query query = session.createQuery(hql);
		query.setParameter("_title", title);
		query.setParameter("_category", category);
		int count = query.getResultList().size();
//		List results = query.list();
//		int count = results.size();
		return count > 0 ? true:false;
	}

}
