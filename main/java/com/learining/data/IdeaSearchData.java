/*
 * This is the property of Mr.Naveen C C
 * The code may not be copied, translated or distributed
 * in any manner (electronic, web or printed) without the prior written
 * consent of Naveen C C, with the exception of properly-attributed
 * quotations and other "fair use" exemptions provided for under copyright law
 * Copyright � 2016 Naveen C C. All rights reserved.
 */
package com.learining.data;

import java.util.List;

/**
 * The Class IdeaSearchData has data attributes of type Idea.
 */
public class IdeaSearchData
{

	/** The id. */
	private String id;

	/** The idea. */
	private String idea;

	/** The idea question. */
	private String ideaQuestion;

	/** The user. */
	private String user;

	/** The category. */
	private List<String> category;

	/** The image path. */
	private String imagePath;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The likes. */
	private String likes;

	/** The dislikes. */
	private String dislikes;

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public List<String> getCategory()
	{
		return category;
	}

	/**
	 * Gets the dislikes.
	 *
	 * @return the dislikes
	 */
	public String getDislikes()
	{
		return dislikes;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Gets the idea.
	 *
	 * @return the idea
	 */
	public String getIdea()
	{
		return idea;
	}

	/**
	 * Gets the idea question.
	 *
	 * @return the idea question
	 */
	public String getIdeaQuestion()
	{
		return ideaQuestion;
	}

	/**
	 * Gets the image path.
	 *
	 * @return the image path
	 */
	public String getImagePath()
	{
		return imagePath;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Gets the likes.
	 *
	 * @return the likes
	 */
	public String getLikes()
	{
		return likes;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public String getUser()
	{
		return user;
	}

	/**
	 * Sets the category.
	 *
	 * @param category
	 *            the new category
	 */
	public void setCategory(List<String> category)
	{
		this.category = category;
	}

	/**
	 * Sets the dislikes.
	 *
	 * @param dislikes
	 *            the new dislikes
	 */
	public void setDislikes(String dislikes)
	{
		this.dislikes = dislikes;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * Sets the idea.
	 *
	 * @param idea
	 *            the new idea
	 */
	public void setIdea(String idea)
	{
		this.idea = idea;
	}

	/**
	 * Sets the idea question.
	 *
	 * @param ideaQuestion
	 *            the new idea question
	 */
	public void setIdeaQuestion(String ideaQuestion)
	{
		this.ideaQuestion = ideaQuestion;
	}

	/**
	 * Sets the image path.
	 *
	 * @param imagePath
	 *            the new image path
	 */
	public void setImagePath(String imagePath)
	{
		this.imagePath = imagePath;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * Sets the likes.
	 *
	 * @param likes
	 *            the new likes
	 */
	public void setLikes(String likes)
	{
		this.likes = likes;
	}

	/**
	 * Sets the user.
	 *
	 * @param user
	 *            the new user
	 */
	public void setUser(String user)
	{
		this.user = user;
	}
}
