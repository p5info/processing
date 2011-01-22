/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
 Part of the Processing project - http://processing.org

 Copyright (c) 2011 Ben Fry and Casey Reas

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License version 2
 as published by the Free Software Foundation.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package processing.mode.android;

import java.io.File;

import processing.app.*;
import processing.mode.java.JavaMode;


public class AndroidMode extends JavaMode {

  public AndroidMode(Base base, File folder) {
    super(base, folder);
  }

  @Override
  public Editor createEditor(Base base, String path, int[] location) {
    return new AndroidEditor(base, path, location, this);
  }

  @Override
  public String getTitle() {
    return "Android";
  }
}