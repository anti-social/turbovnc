/* Copyright (C) 2002-2005 RealVNC Ltd.  All Rights Reserved.
 * Copyright (C) 2012, 2018 D. R. Commander.  All Rights Reserved.
 *
 * This is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this software; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */

package com.turbovnc.rfb;

public class AliasParameter extends VoidParameter {
  public AliasParameter(String name_, String desc_, VoidParameter v) {
    super(name_, desc_);
    param = v;
  }

  public boolean setParam(String v) { return param.setParam(v); }
  public boolean setParam() { return param.setParam(); }

  public synchronized void reset() { param.reset(); }

  public String getDefaultStr() { return null; }
  public String getValues() { return null; }
  public boolean isBool() { return param.isBool(); }

  protected VoidParameter param;
}
