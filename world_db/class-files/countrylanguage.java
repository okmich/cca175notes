// ORM class for table 'countrylanguage'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 30 22:52:06 WAT 2016
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class countrylanguage extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String CountryCode;
  public String get_CountryCode() {
    return CountryCode;
  }
  public void set_CountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
  }
  public countrylanguage with_CountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
    return this;
  }
  private String Language;
  public String get_Language() {
    return Language;
  }
  public void set_Language(String Language) {
    this.Language = Language;
  }
  public countrylanguage with_Language(String Language) {
    this.Language = Language;
    return this;
  }
  private String IsOfficial;
  public String get_IsOfficial() {
    return IsOfficial;
  }
  public void set_IsOfficial(String IsOfficial) {
    this.IsOfficial = IsOfficial;
  }
  public countrylanguage with_IsOfficial(String IsOfficial) {
    this.IsOfficial = IsOfficial;
    return this;
  }
  private Float Percentage;
  public Float get_Percentage() {
    return Percentage;
  }
  public void set_Percentage(Float Percentage) {
    this.Percentage = Percentage;
  }
  public countrylanguage with_Percentage(Float Percentage) {
    this.Percentage = Percentage;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof countrylanguage)) {
      return false;
    }
    countrylanguage that = (countrylanguage) o;
    boolean equal = true;
    equal = equal && (this.CountryCode == null ? that.CountryCode == null : this.CountryCode.equals(that.CountryCode));
    equal = equal && (this.Language == null ? that.Language == null : this.Language.equals(that.Language));
    equal = equal && (this.IsOfficial == null ? that.IsOfficial == null : this.IsOfficial.equals(that.IsOfficial));
    equal = equal && (this.Percentage == null ? that.Percentage == null : this.Percentage.equals(that.Percentage));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof countrylanguage)) {
      return false;
    }
    countrylanguage that = (countrylanguage) o;
    boolean equal = true;
    equal = equal && (this.CountryCode == null ? that.CountryCode == null : this.CountryCode.equals(that.CountryCode));
    equal = equal && (this.Language == null ? that.Language == null : this.Language.equals(that.Language));
    equal = equal && (this.IsOfficial == null ? that.IsOfficial == null : this.IsOfficial.equals(that.IsOfficial));
    equal = equal && (this.Percentage == null ? that.Percentage == null : this.Percentage.equals(that.Percentage));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CountryCode = JdbcWritableBridge.readString(1, __dbResults);
    this.Language = JdbcWritableBridge.readString(2, __dbResults);
    this.IsOfficial = JdbcWritableBridge.readString(3, __dbResults);
    this.Percentage = JdbcWritableBridge.readFloat(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CountryCode = JdbcWritableBridge.readString(1, __dbResults);
    this.Language = JdbcWritableBridge.readString(2, __dbResults);
    this.IsOfficial = JdbcWritableBridge.readString(3, __dbResults);
    this.Percentage = JdbcWritableBridge.readFloat(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CountryCode, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Language, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(IsOfficial, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(Percentage, 4 + __off, 7, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CountryCode, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Language, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(IsOfficial, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(Percentage, 4 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CountryCode = null;
    } else {
    this.CountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Language = null;
    } else {
    this.Language = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IsOfficial = null;
    } else {
    this.IsOfficial = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Percentage = null;
    } else {
    this.Percentage = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryCode);
    }
    if (null == this.Language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Language);
    }
    if (null == this.IsOfficial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IsOfficial);
    }
    if (null == this.Percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Percentage);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryCode);
    }
    if (null == this.Language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Language);
    }
    if (null == this.IsOfficial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IsOfficial);
    }
    if (null == this.Percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Percentage);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CountryCode==null?"null":CountryCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Language==null?"null":Language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IsOfficial==null?"null":IsOfficial, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Percentage==null?"null":"" + Percentage, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CountryCode==null?"null":CountryCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Language==null?"null":Language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IsOfficial==null?"null":IsOfficial, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Percentage==null?"null":"" + Percentage, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryCode = null; } else {
      this.CountryCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Language = null; } else {
      this.Language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IsOfficial = null; } else {
      this.IsOfficial = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Percentage = null; } else {
      this.Percentage = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryCode = null; } else {
      this.CountryCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Language = null; } else {
      this.Language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IsOfficial = null; } else {
      this.IsOfficial = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Percentage = null; } else {
      this.Percentage = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    countrylanguage o = (countrylanguage) super.clone();
    return o;
  }

  public void clone0(countrylanguage o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CountryCode", this.CountryCode);
    __sqoop$field_map.put("Language", this.Language);
    __sqoop$field_map.put("IsOfficial", this.IsOfficial);
    __sqoop$field_map.put("Percentage", this.Percentage);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CountryCode", this.CountryCode);
    __sqoop$field_map.put("Language", this.Language);
    __sqoop$field_map.put("IsOfficial", this.IsOfficial);
    __sqoop$field_map.put("Percentage", this.Percentage);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CountryCode".equals(__fieldName)) {
      this.CountryCode = (String) __fieldVal;
    }
    else    if ("Language".equals(__fieldName)) {
      this.Language = (String) __fieldVal;
    }
    else    if ("IsOfficial".equals(__fieldName)) {
      this.IsOfficial = (String) __fieldVal;
    }
    else    if ("Percentage".equals(__fieldName)) {
      this.Percentage = (Float) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CountryCode".equals(__fieldName)) {
      this.CountryCode = (String) __fieldVal;
      return true;
    }
    else    if ("Language".equals(__fieldName)) {
      this.Language = (String) __fieldVal;
      return true;
    }
    else    if ("IsOfficial".equals(__fieldName)) {
      this.IsOfficial = (String) __fieldVal;
      return true;
    }
    else    if ("Percentage".equals(__fieldName)) {
      this.Percentage = (Float) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
