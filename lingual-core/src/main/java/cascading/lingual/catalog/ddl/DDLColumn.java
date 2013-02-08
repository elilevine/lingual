/*
 * Copyright (c) 2007-2013 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cascading.lingual.catalog.ddl;

import java.lang.reflect.Type;

import cascading.util.Util;

/**
 *
 */
public class DDLColumn
  {
  String name;
  Type type;

  public DDLColumn( String name, Type type )
    {
    this.name = name;
    this.type = type;
    }

  @Override
  public String toString()
    {
    final StringBuilder sb = new StringBuilder();
    sb.append( "Column" );
    sb.append( "{name='" ).append( name ).append( '\'' );
    sb.append( ", type=" ).append( Util.getTypeName( type ) );
    sb.append( '}' );
    return sb.toString();
    }
  }
