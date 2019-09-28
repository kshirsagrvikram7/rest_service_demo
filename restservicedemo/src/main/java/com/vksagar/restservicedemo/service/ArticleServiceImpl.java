package com.vksagar.restservicedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vksagar.restservicedemo.dao.IArticleDAO;
import com.vksagar.restservicedemo.model.Article;

@Service
public class ArticleServiceImpl implements IArticleService {

	@Autowired
	private IArticleDAO articleDao;

	@Override
	public List<Article> getAllArticles() {
		return articleDao.getAllArticles();
	}

	@Override
	public Article getArticleById(int articleId) {
		return articleDao.getArticleById(articleId);
	}

	@Override
	public synchronized boolean addArticle(Article article) {
		if (articleDao.articleExists(article.getTitle(), article.getCategory()))
			return false;
		else {
			articleDao.addArticle(article);
			return true;
		}
	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}

	@Override
	public void deleteArticle(int articleId) {
		articleDao.deleteArticle(articleId);
	}

}
