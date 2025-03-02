/*
 * The MIT License
 *
 * Copyright 2019 brunomnsilva.
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
package org.intrigus.smartgraph.graphview;

import java.util.Collection;
import java.util.Random;

import org.intrigus.smartgraph.graph.Graph;

/**
 * Scatters the vertices randomly.
 * 
 * @see SmartPlacementStrategy
 * 
 * @author brunomnsilva
 */
public class SmartRandomPlacementStrategy implements SmartPlacementStrategy {

    @Override
    public <V, E> void place(double width, double height, Graph<V, E> theGraph, Collection<? extends SmartGraphVertex<V>> vertices) {
        
        Random rand = new Random();

        for (SmartGraphVertex<V> vertex : vertices) {
            
            double x = rand.nextDouble() * width;
            double y = rand.nextDouble() * height;
                        
            vertex.setPosition(x, y);
          
        }
    }
    
}
