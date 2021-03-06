/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

#include <directfb.h>
#include "net_java_openjdk_cacio_directfb_DirectFBGraphicsEnvironment.h"

// extern jclass tkClass;

JNIEXPORT jlong JNICALL Java_net_java_openjdk_cacio_directfb_DirectFBGraphicsEnvironment_createDirectFB(JNIEnv* env, jobject thiz) {

  IDirectFB* dfb = NULL;
  int dummy_argc = 0;
  char* dummy_argv[0];
  DirectFBInit(&dummy_argc, &dummy_argv);
  DirectFBCreate(&dfb);

  dfb->SetCooperativeLevel(dfb, DFSCL_NORMAL);

  printf("created directfb: %p\n", dfb);

  //printf("DEBUG tkClass: %p", tkClass);
  return (long) dfb;
}
