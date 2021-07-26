package com.harsh.harsh.service;

import java.util.List;

import com.harsh.harsh.modal.Parent;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class DataFetcher {
	private List<Parent> lists = List.of( new Parent("a", 30),new Parent("b", 35),new Parent("c", 40));
	@DgsQuery 
	public List<Parent> parents (){
		return lists;
		
	}
}
