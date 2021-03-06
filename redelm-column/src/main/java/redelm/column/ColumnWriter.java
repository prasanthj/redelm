/**
 * Copyright 2012 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package redelm.column;

import java.io.DataOutput;
import java.io.IOException;

public interface ColumnWriter {
  void write(int value, int repetitionLevel, int definitionLevel);

  void write(long value, int repetitionLevel, int definitionLevel);

  void write(String value, int repetitionLevel, int definitionLevel);

  void write(boolean value, int repetitionLevel, int definitionLevel);

  void write(byte[] value, int repetitionLevel, int definitionLevel);

  void write(float value, int repetitionLevel, int definitionLevel);

  void write(double value, int repetitionLevel, int definitionLevel);

  void writeNull(int repetitionLevel, int definitionLevel);

  void writeRepetitionLevelColumn(DataOutput out) throws IOException;

  void writeDefinitionLevelColumn(DataOutput out) throws IOException;

  void writeDataColumn(DataOutput out) throws IOException ;

  void reset();

  int getValueCount();
}