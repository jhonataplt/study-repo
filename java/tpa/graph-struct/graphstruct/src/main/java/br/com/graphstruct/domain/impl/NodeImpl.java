package br.com.graphstruct.domain.impl;

import java.util.HashSet;
import java.util.Set;

import br.com.graphstruct.domain.Edge;
import br.com.graphstruct.domain.Node;

public class NodeImpl<T> implements Node<T> {

	private T value;
	private Set<Edge> edges = new HashSet<Edge>();

	public NodeImpl(T value) {
		this.value = value;
	}

	@Override
	public T getValue() {
		return value;
	}

	@Override
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "NodeImpl [value=" + value + ", edges=" + edges + "]";
	}

}
