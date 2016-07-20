// ORM class for table 'country'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 30 22:51:45 WAT 2016
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

public class country extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String Code;
  public String get_Code() {
    return Code;
  }
  public void set_Code(String Code) {
    this.Code = Code;
  }
  public country with_Code(String Code) {
    this.Code = Code;
    return this;
  }
  private String Name;
  public String get_Name() {
    return Name;
  }
  public void set_Name(String Name) {
    this.Name = Name;
  }
  public country with_Name(String Name) {
    this.Name = Name;
    return this;
  }
  private String Continent;
  public String get_Continent() {
    return Continent;
  }
  public void set_Continent(String Continent) {
    this.Continent = Continent;
  }
  public country with_Continent(String Continent) {
    this.Continent = Continent;
    return this;
  }
  private String Region;
  public String get_Region() {
    return Region;
  }
  public void set_Region(String Region) {
    this.Region = Region;
  }
  public country with_Region(String Region) {
    this.Region = Region;
    return this;
  }
  private Float SurfaceArea;
  public Float get_SurfaceArea() {
    return SurfaceArea;
  }
  public void set_SurfaceArea(Float SurfaceArea) {
    this.SurfaceArea = SurfaceArea;
  }
  public country with_SurfaceArea(Float SurfaceArea) {
    this.SurfaceArea = SurfaceArea;
    return this;
  }
  private Integer IndepYear;
  public Integer get_IndepYear() {
    return IndepYear;
  }
  public void set_IndepYear(Integer IndepYear) {
    this.IndepYear = IndepYear;
  }
  public country with_IndepYear(Integer IndepYear) {
    this.IndepYear = IndepYear;
    return this;
  }
  private Integer Population;
  public Integer get_Population() {
    return Population;
  }
  public void set_Population(Integer Population) {
    this.Population = Population;
  }
  public country with_Population(Integer Population) {
    this.Population = Population;
    return this;
  }
  private Float LifeExpectancy;
  public Float get_LifeExpectancy() {
    return LifeExpectancy;
  }
  public void set_LifeExpectancy(Float LifeExpectancy) {
    this.LifeExpectancy = LifeExpectancy;
  }
  public country with_LifeExpectancy(Float LifeExpectancy) {
    this.LifeExpectancy = LifeExpectancy;
    return this;
  }
  private Float GNP;
  public Float get_GNP() {
    return GNP;
  }
  public void set_GNP(Float GNP) {
    this.GNP = GNP;
  }
  public country with_GNP(Float GNP) {
    this.GNP = GNP;
    return this;
  }
  private Float GNPOld;
  public Float get_GNPOld() {
    return GNPOld;
  }
  public void set_GNPOld(Float GNPOld) {
    this.GNPOld = GNPOld;
  }
  public country with_GNPOld(Float GNPOld) {
    this.GNPOld = GNPOld;
    return this;
  }
  private String LocalName;
  public String get_LocalName() {
    return LocalName;
  }
  public void set_LocalName(String LocalName) {
    this.LocalName = LocalName;
  }
  public country with_LocalName(String LocalName) {
    this.LocalName = LocalName;
    return this;
  }
  private String GovernmentForm;
  public String get_GovernmentForm() {
    return GovernmentForm;
  }
  public void set_GovernmentForm(String GovernmentForm) {
    this.GovernmentForm = GovernmentForm;
  }
  public country with_GovernmentForm(String GovernmentForm) {
    this.GovernmentForm = GovernmentForm;
    return this;
  }
  private String HeadOfState;
  public String get_HeadOfState() {
    return HeadOfState;
  }
  public void set_HeadOfState(String HeadOfState) {
    this.HeadOfState = HeadOfState;
  }
  public country with_HeadOfState(String HeadOfState) {
    this.HeadOfState = HeadOfState;
    return this;
  }
  private Integer Capital;
  public Integer get_Capital() {
    return Capital;
  }
  public void set_Capital(Integer Capital) {
    this.Capital = Capital;
  }
  public country with_Capital(Integer Capital) {
    this.Capital = Capital;
    return this;
  }
  private String Code2;
  public String get_Code2() {
    return Code2;
  }
  public void set_Code2(String Code2) {
    this.Code2 = Code2;
  }
  public country with_Code2(String Code2) {
    this.Code2 = Code2;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof country)) {
      return false;
    }
    country that = (country) o;
    boolean equal = true;
    equal = equal && (this.Code == null ? that.Code == null : this.Code.equals(that.Code));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.Continent == null ? that.Continent == null : this.Continent.equals(that.Continent));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.SurfaceArea == null ? that.SurfaceArea == null : this.SurfaceArea.equals(that.SurfaceArea));
    equal = equal && (this.IndepYear == null ? that.IndepYear == null : this.IndepYear.equals(that.IndepYear));
    equal = equal && (this.Population == null ? that.Population == null : this.Population.equals(that.Population));
    equal = equal && (this.LifeExpectancy == null ? that.LifeExpectancy == null : this.LifeExpectancy.equals(that.LifeExpectancy));
    equal = equal && (this.GNP == null ? that.GNP == null : this.GNP.equals(that.GNP));
    equal = equal && (this.GNPOld == null ? that.GNPOld == null : this.GNPOld.equals(that.GNPOld));
    equal = equal && (this.LocalName == null ? that.LocalName == null : this.LocalName.equals(that.LocalName));
    equal = equal && (this.GovernmentForm == null ? that.GovernmentForm == null : this.GovernmentForm.equals(that.GovernmentForm));
    equal = equal && (this.HeadOfState == null ? that.HeadOfState == null : this.HeadOfState.equals(that.HeadOfState));
    equal = equal && (this.Capital == null ? that.Capital == null : this.Capital.equals(that.Capital));
    equal = equal && (this.Code2 == null ? that.Code2 == null : this.Code2.equals(that.Code2));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof country)) {
      return false;
    }
    country that = (country) o;
    boolean equal = true;
    equal = equal && (this.Code == null ? that.Code == null : this.Code.equals(that.Code));
    equal = equal && (this.Name == null ? that.Name == null : this.Name.equals(that.Name));
    equal = equal && (this.Continent == null ? that.Continent == null : this.Continent.equals(that.Continent));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.SurfaceArea == null ? that.SurfaceArea == null : this.SurfaceArea.equals(that.SurfaceArea));
    equal = equal && (this.IndepYear == null ? that.IndepYear == null : this.IndepYear.equals(that.IndepYear));
    equal = equal && (this.Population == null ? that.Population == null : this.Population.equals(that.Population));
    equal = equal && (this.LifeExpectancy == null ? that.LifeExpectancy == null : this.LifeExpectancy.equals(that.LifeExpectancy));
    equal = equal && (this.GNP == null ? that.GNP == null : this.GNP.equals(that.GNP));
    equal = equal && (this.GNPOld == null ? that.GNPOld == null : this.GNPOld.equals(that.GNPOld));
    equal = equal && (this.LocalName == null ? that.LocalName == null : this.LocalName.equals(that.LocalName));
    equal = equal && (this.GovernmentForm == null ? that.GovernmentForm == null : this.GovernmentForm.equals(that.GovernmentForm));
    equal = equal && (this.HeadOfState == null ? that.HeadOfState == null : this.HeadOfState.equals(that.HeadOfState));
    equal = equal && (this.Capital == null ? that.Capital == null : this.Capital.equals(that.Capital));
    equal = equal && (this.Code2 == null ? that.Code2 == null : this.Code2.equals(that.Code2));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Code = JdbcWritableBridge.readString(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.Continent = JdbcWritableBridge.readString(3, __dbResults);
    this.Region = JdbcWritableBridge.readString(4, __dbResults);
    this.SurfaceArea = JdbcWritableBridge.readFloat(5, __dbResults);
    this.IndepYear = JdbcWritableBridge.readInteger(6, __dbResults);
    this.Population = JdbcWritableBridge.readInteger(7, __dbResults);
    this.LifeExpectancy = JdbcWritableBridge.readFloat(8, __dbResults);
    this.GNP = JdbcWritableBridge.readFloat(9, __dbResults);
    this.GNPOld = JdbcWritableBridge.readFloat(10, __dbResults);
    this.LocalName = JdbcWritableBridge.readString(11, __dbResults);
    this.GovernmentForm = JdbcWritableBridge.readString(12, __dbResults);
    this.HeadOfState = JdbcWritableBridge.readString(13, __dbResults);
    this.Capital = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Code2 = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Code = JdbcWritableBridge.readString(1, __dbResults);
    this.Name = JdbcWritableBridge.readString(2, __dbResults);
    this.Continent = JdbcWritableBridge.readString(3, __dbResults);
    this.Region = JdbcWritableBridge.readString(4, __dbResults);
    this.SurfaceArea = JdbcWritableBridge.readFloat(5, __dbResults);
    this.IndepYear = JdbcWritableBridge.readInteger(6, __dbResults);
    this.Population = JdbcWritableBridge.readInteger(7, __dbResults);
    this.LifeExpectancy = JdbcWritableBridge.readFloat(8, __dbResults);
    this.GNP = JdbcWritableBridge.readFloat(9, __dbResults);
    this.GNPOld = JdbcWritableBridge.readFloat(10, __dbResults);
    this.LocalName = JdbcWritableBridge.readString(11, __dbResults);
    this.GovernmentForm = JdbcWritableBridge.readString(12, __dbResults);
    this.HeadOfState = JdbcWritableBridge.readString(13, __dbResults);
    this.Capital = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Code2 = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(Code, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Continent, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Region, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(SurfaceArea, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(IndepYear, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(Population, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(LifeExpectancy, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(GNP, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(GNPOld, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(LocalName, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(GovernmentForm, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(HeadOfState, 13 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Capital, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Code2, 15 + __off, 1, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Code, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Name, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Continent, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Region, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(SurfaceArea, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(IndepYear, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(Population, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(LifeExpectancy, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(GNP, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(GNPOld, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(LocalName, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(GovernmentForm, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(HeadOfState, 13 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Capital, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Code2, 15 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Code = null;
    } else {
    this.Code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Name = null;
    } else {
    this.Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Continent = null;
    } else {
    this.Continent = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Region = null;
    } else {
    this.Region = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SurfaceArea = null;
    } else {
    this.SurfaceArea = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.IndepYear = null;
    } else {
    this.IndepYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Population = null;
    } else {
    this.Population = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LifeExpectancy = null;
    } else {
    this.LifeExpectancy = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.GNP = null;
    } else {
    this.GNP = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.GNPOld = null;
    } else {
    this.GNPOld = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.LocalName = null;
    } else {
    this.LocalName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GovernmentForm = null;
    } else {
    this.GovernmentForm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HeadOfState = null;
    } else {
    this.HeadOfState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Capital = null;
    } else {
    this.Capital = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Code2 = null;
    } else {
    this.Code2 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Code);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.Continent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Continent);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.SurfaceArea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.SurfaceArea);
    }
    if (null == this.IndepYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.IndepYear);
    }
    if (null == this.Population) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Population);
    }
    if (null == this.LifeExpectancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.LifeExpectancy);
    }
    if (null == this.GNP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.GNP);
    }
    if (null == this.GNPOld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.GNPOld);
    }
    if (null == this.LocalName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LocalName);
    }
    if (null == this.GovernmentForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GovernmentForm);
    }
    if (null == this.HeadOfState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HeadOfState);
    }
    if (null == this.Capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Capital);
    }
    if (null == this.Code2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Code2);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Code);
    }
    if (null == this.Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Name);
    }
    if (null == this.Continent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Continent);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.SurfaceArea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.SurfaceArea);
    }
    if (null == this.IndepYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.IndepYear);
    }
    if (null == this.Population) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Population);
    }
    if (null == this.LifeExpectancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.LifeExpectancy);
    }
    if (null == this.GNP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.GNP);
    }
    if (null == this.GNPOld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.GNPOld);
    }
    if (null == this.LocalName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LocalName);
    }
    if (null == this.GovernmentForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GovernmentForm);
    }
    if (null == this.HeadOfState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HeadOfState);
    }
    if (null == this.Capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Capital);
    }
    if (null == this.Code2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Code2);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Code==null?"null":Code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Continent==null?"null":Continent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Region==null?"null":Region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SurfaceArea==null?"null":"" + SurfaceArea, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndepYear==null?"null":"" + IndepYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Population==null?"null":"" + Population, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LifeExpectancy==null?"null":"" + LifeExpectancy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GNP==null?"null":"" + GNP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GNPOld==null?"null":"" + GNPOld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LocalName==null?"null":LocalName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GovernmentForm==null?"null":GovernmentForm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HeadOfState==null?"null":HeadOfState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Capital==null?"null":"" + Capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Code2==null?"null":Code2, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Code==null?"null":Code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Name==null?"null":Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Continent==null?"null":Continent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Region==null?"null":Region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SurfaceArea==null?"null":"" + SurfaceArea, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndepYear==null?"null":"" + IndepYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Population==null?"null":"" + Population, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LifeExpectancy==null?"null":"" + LifeExpectancy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GNP==null?"null":"" + GNP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GNPOld==null?"null":"" + GNPOld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LocalName==null?"null":LocalName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GovernmentForm==null?"null":GovernmentForm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HeadOfState==null?"null":HeadOfState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Capital==null?"null":"" + Capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Code2==null?"null":Code2, delimiters));
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
    if (__cur_str.equals("null")) { this.Code = null; } else {
      this.Code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Continent = null; } else {
      this.Continent = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SurfaceArea = null; } else {
      this.SurfaceArea = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IndepYear = null; } else {
      this.IndepYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Population = null; } else {
      this.Population = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LifeExpectancy = null; } else {
      this.LifeExpectancy = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GNP = null; } else {
      this.GNP = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GNPOld = null; } else {
      this.GNPOld = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LocalName = null; } else {
      this.LocalName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GovernmentForm = null; } else {
      this.GovernmentForm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HeadOfState = null; } else {
      this.HeadOfState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Capital = null; } else {
      this.Capital = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Code2 = null; } else {
      this.Code2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Code = null; } else {
      this.Code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Name = null; } else {
      this.Name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Continent = null; } else {
      this.Continent = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SurfaceArea = null; } else {
      this.SurfaceArea = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IndepYear = null; } else {
      this.IndepYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Population = null; } else {
      this.Population = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LifeExpectancy = null; } else {
      this.LifeExpectancy = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GNP = null; } else {
      this.GNP = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GNPOld = null; } else {
      this.GNPOld = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LocalName = null; } else {
      this.LocalName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GovernmentForm = null; } else {
      this.GovernmentForm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HeadOfState = null; } else {
      this.HeadOfState = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Capital = null; } else {
      this.Capital = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Code2 = null; } else {
      this.Code2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    country o = (country) super.clone();
    return o;
  }

  public void clone0(country o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("Code", this.Code);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("Continent", this.Continent);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("SurfaceArea", this.SurfaceArea);
    __sqoop$field_map.put("IndepYear", this.IndepYear);
    __sqoop$field_map.put("Population", this.Population);
    __sqoop$field_map.put("LifeExpectancy", this.LifeExpectancy);
    __sqoop$field_map.put("GNP", this.GNP);
    __sqoop$field_map.put("GNPOld", this.GNPOld);
    __sqoop$field_map.put("LocalName", this.LocalName);
    __sqoop$field_map.put("GovernmentForm", this.GovernmentForm);
    __sqoop$field_map.put("HeadOfState", this.HeadOfState);
    __sqoop$field_map.put("Capital", this.Capital);
    __sqoop$field_map.put("Code2", this.Code2);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Code", this.Code);
    __sqoop$field_map.put("Name", this.Name);
    __sqoop$field_map.put("Continent", this.Continent);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("SurfaceArea", this.SurfaceArea);
    __sqoop$field_map.put("IndepYear", this.IndepYear);
    __sqoop$field_map.put("Population", this.Population);
    __sqoop$field_map.put("LifeExpectancy", this.LifeExpectancy);
    __sqoop$field_map.put("GNP", this.GNP);
    __sqoop$field_map.put("GNPOld", this.GNPOld);
    __sqoop$field_map.put("LocalName", this.LocalName);
    __sqoop$field_map.put("GovernmentForm", this.GovernmentForm);
    __sqoop$field_map.put("HeadOfState", this.HeadOfState);
    __sqoop$field_map.put("Capital", this.Capital);
    __sqoop$field_map.put("Code2", this.Code2);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("Code".equals(__fieldName)) {
      this.Code = (String) __fieldVal;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
    }
    else    if ("Continent".equals(__fieldName)) {
      this.Continent = (String) __fieldVal;
    }
    else    if ("Region".equals(__fieldName)) {
      this.Region = (String) __fieldVal;
    }
    else    if ("SurfaceArea".equals(__fieldName)) {
      this.SurfaceArea = (Float) __fieldVal;
    }
    else    if ("IndepYear".equals(__fieldName)) {
      this.IndepYear = (Integer) __fieldVal;
    }
    else    if ("Population".equals(__fieldName)) {
      this.Population = (Integer) __fieldVal;
    }
    else    if ("LifeExpectancy".equals(__fieldName)) {
      this.LifeExpectancy = (Float) __fieldVal;
    }
    else    if ("GNP".equals(__fieldName)) {
      this.GNP = (Float) __fieldVal;
    }
    else    if ("GNPOld".equals(__fieldName)) {
      this.GNPOld = (Float) __fieldVal;
    }
    else    if ("LocalName".equals(__fieldName)) {
      this.LocalName = (String) __fieldVal;
    }
    else    if ("GovernmentForm".equals(__fieldName)) {
      this.GovernmentForm = (String) __fieldVal;
    }
    else    if ("HeadOfState".equals(__fieldName)) {
      this.HeadOfState = (String) __fieldVal;
    }
    else    if ("Capital".equals(__fieldName)) {
      this.Capital = (Integer) __fieldVal;
    }
    else    if ("Code2".equals(__fieldName)) {
      this.Code2 = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("Code".equals(__fieldName)) {
      this.Code = (String) __fieldVal;
      return true;
    }
    else    if ("Name".equals(__fieldName)) {
      this.Name = (String) __fieldVal;
      return true;
    }
    else    if ("Continent".equals(__fieldName)) {
      this.Continent = (String) __fieldVal;
      return true;
    }
    else    if ("Region".equals(__fieldName)) {
      this.Region = (String) __fieldVal;
      return true;
    }
    else    if ("SurfaceArea".equals(__fieldName)) {
      this.SurfaceArea = (Float) __fieldVal;
      return true;
    }
    else    if ("IndepYear".equals(__fieldName)) {
      this.IndepYear = (Integer) __fieldVal;
      return true;
    }
    else    if ("Population".equals(__fieldName)) {
      this.Population = (Integer) __fieldVal;
      return true;
    }
    else    if ("LifeExpectancy".equals(__fieldName)) {
      this.LifeExpectancy = (Float) __fieldVal;
      return true;
    }
    else    if ("GNP".equals(__fieldName)) {
      this.GNP = (Float) __fieldVal;
      return true;
    }
    else    if ("GNPOld".equals(__fieldName)) {
      this.GNPOld = (Float) __fieldVal;
      return true;
    }
    else    if ("LocalName".equals(__fieldName)) {
      this.LocalName = (String) __fieldVal;
      return true;
    }
    else    if ("GovernmentForm".equals(__fieldName)) {
      this.GovernmentForm = (String) __fieldVal;
      return true;
    }
    else    if ("HeadOfState".equals(__fieldName)) {
      this.HeadOfState = (String) __fieldVal;
      return true;
    }
    else    if ("Capital".equals(__fieldName)) {
      this.Capital = (Integer) __fieldVal;
      return true;
    }
    else    if ("Code2".equals(__fieldName)) {
      this.Code2 = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
