package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Taxi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-21T03:13:53.005Z")

public class Taxi   {
  @JsonProperty("taxiId")
  private Long taxiId = null;

  @JsonProperty("longitude")
  private Long longitude = null;

  @JsonProperty("latitude")
  private Integer latitude = null;

  /**
   * Order Status
   */
  public enum StatusEnum {
    BUSY("busy"),
    
    FREE("free");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets taxiType
   */
  public enum TaxiTypeEnum {
    ECO("eco"),
    
    STANDARD("standard"),
    
    PREMIUM("premium");

    private String value;

    TaxiTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaxiTypeEnum fromValue(String text) {
      for (TaxiTypeEnum b : TaxiTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("taxi_type")
  private TaxiTypeEnum taxiType = null;

  @JsonProperty("car_brand")
  private String carBrand = null;

  public Taxi taxiId(Long taxiId) {
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

  public Taxi longitude(Long longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public Long getLongitude() {
    return longitude;
  }

  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }

  public Taxi latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public Taxi status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
  **/
  @ApiModelProperty(value = "Order Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Taxi taxiType(TaxiTypeEnum taxiType) {
    this.taxiType = taxiType;
    return this;
  }

  /**
   * Get taxiType
   * @return taxiType
  **/
  @ApiModelProperty(value = "")


  public TaxiTypeEnum getTaxiType() {
    return taxiType;
  }

  public void setTaxiType(TaxiTypeEnum taxiType) {
    this.taxiType = taxiType;
  }

  public Taxi carBrand(String carBrand) {
    this.carBrand = carBrand;
    return this;
  }

  /**
   * Make of the car
   * @return carBrand
  **/
  @ApiModelProperty(value = "Make of the car")


  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxi taxi = (Taxi) o;
    return Objects.equals(this.taxiId, taxi.taxiId) &&
        Objects.equals(this.longitude, taxi.longitude) &&
        Objects.equals(this.latitude, taxi.latitude) &&
        Objects.equals(this.status, taxi.status) &&
        Objects.equals(this.taxiType, taxi.taxiType) &&
        Objects.equals(this.carBrand, taxi.carBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxiId, longitude, latitude, status, taxiType, carBrand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxi {\n");
    
    sb.append("    taxiId: ").append(toIndentedString(taxiId)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxiType: ").append(toIndentedString(taxiType)).append("\n");
    sb.append("    carBrand: ").append(toIndentedString(carBrand)).append("\n");
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

