package com.github.igotyou.FactoryMod.commands;

import java.util.List;

import vg.civcraft.mc.civmodcore.command.Trie;

public class FactoryTabCompleters {

	private static Trie factoryTrie = Trie.getNewTrie();
	private static Trie recipeTrie = Trie.getNewTrie();

	public static void addFactory(String name) {
		factoryTrie.insert(name.toLowerCase());
	}

	public static void addRecipe(String name) {
		recipeTrie.insert(name.toLowerCase());
	}

	public static List<String> completeFactory(String [] args) {
		return factoryTrie.complete(args);
	}

	public static List<String> completeRecipe(String [] args) {
		return recipeTrie.complete(args);
	}

}
