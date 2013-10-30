/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.design.pattern.strategy;

import com.design.pattern.strategy.action.FlyNoWay;
import com.design.pattern.strategy.action.Squeak;

import static java.lang.System.out;

/**
 * 橡皮鸭。
 *
 * @author	lihg
 * @version 2013-10-30
 */

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak(); // 吱吱叫
		flyBehavior = new FlyNoWay(); // 不会飞
	}

	@Override
	public void display() {
		out.println("I'm a real Rubber duck");
	}

}
