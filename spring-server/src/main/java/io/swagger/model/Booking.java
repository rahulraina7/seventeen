package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Booking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-21T03:13:53.005Z")

public class Booking   {
  @JsonProperty("bookingId")
  private Long bookingId = null;

  @JsonProperty("taxiId")
  private Long taxiId = null;

  @JsonProperty("src")
  private Long src = null;

  @JsonProperty("dest")
  private Integer dest = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  public Booking bookingId(Long bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  **/
  @ApiModelProperty(value = "")


  public Long getBookingId() {
    return bookingId;
  }

  public void setBookingId(Long bookingId) {
    this.bookingId = bookingId;
  }

  public Booking taxiId(Long taxiId) {
    this.taxiId = taxiId;
    return this;
  }

  /**
   * Get taxiId
   * @return taxiId
  **/
  @ApiModelProperty(value = "")


  public Long getTaxiId() {
    return taxiId;
  }

  public void setTaxiId(Long taxiId) {
    this.taxiId = taxiId;
  }

  public Booking src(Long src) {
    this.src = src;
    return this;
  }

  /**
   * Get src
   * @return src
  **/
  @ApiModelProperty(value = "")


  public Long getSrc() {
    return src;
  }

  public void setSrc(Long src) {
    this.src = src;
  }

  public Booking dest(Integer dest) {
    this.dest = dest;
    return this;
  }

  /**
   * Get dest
   * @return dest
  **/
  @ApiModelProperty(value = "")


  public Integer getDest() {
    return dest;
  }

  public void setDest(Integer dest) {
    this.dest = dest;
  }

  public Booking timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Booking price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.bookingId, booking.bookingId) &&
        Objects.equals(this.taxiId, booking.taxiId) &&
        Objects.equals(this.src, booking.src) &&
        Objects.equals(this.dest, booking.dest) &&
        Objects.equals(this.timestamp, booking.timestamp) &&
        Objects.equals(this.price, booking.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, taxiId, src, dest, timestamp, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    taxiId: ").append(toIndentedString(taxiId)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

