/*
 * Copyright 2022 CyrilFeng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.qcalculator.core.precompute;

import cn.hutool.extra.spring.SpringUtil;
import com.google.common.collect.Sets;
import java.util.Set;

/**
 * PreCompute 实现类,需要在启动类中注册
 *
 * @author: CyrilFeng
 * @date: 2022/8
 */
@SuppressWarnings("all")
public class PreComputeHolder {

  public static Set<PreCompute> COMPUTES = Sets.newHashSet();

  static {
    COMPUTES.addAll(SpringUtil.getBeansOfType(PreCompute.class).values());
  }
}
