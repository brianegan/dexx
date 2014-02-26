/*
 * Copyright (c) 2014 Andrew O'Malley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.andrewoma.dexx.collection.internal.redblack;

import com.github.andrewoma.dexx.collection.KeyFunction;

import java.io.Serializable;

public abstract class AbstractTree<K, V> implements Serializable, Tree<K, V> {
    private final Tree<K, V> left;
    private final Tree<K, V> right;
    private final V value;

    protected AbstractTree(Tree<K, V> left, Tree<K, V> right, V value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public int count() {
        return 1 + RedBlackTree.count(getLeft()) + RedBlackTree.count(getRight());
    }

    public abstract K getKey(KeyFunction<K, V> keyFunction);

    public V getValue() {
        return value;
    }

    public Tree<K, V> getLeft() {
        return left;
    }

    public Tree<K, V> getRight() {
        return right;
    }
}


