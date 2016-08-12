package example.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cjemison on 8/12/16.
 */
public class HelloVO {
  private final String name;

  @JsonCreator
  public HelloVO(@JsonProperty("name") String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    HelloVO helloVO = (HelloVO) o;

    return name != null ? name.equals(helloVO.name) : helloVO.name == null;

  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
