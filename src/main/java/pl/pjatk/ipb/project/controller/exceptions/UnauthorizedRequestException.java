package pl.pjatk.ipb.project.controller.exceptions;

import lombok.Getter;

@Getter
public class UnauthorizedRequestException extends RuntimeException {
  public UnauthorizedRequestException() {
    super("Unauthorized request");
  }
}
