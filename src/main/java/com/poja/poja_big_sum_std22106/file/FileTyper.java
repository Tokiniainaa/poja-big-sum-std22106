package com.poja.poja_big_sum_std22106.file;

import static org.springframework.http.MediaType.parseMediaType;

import com.poja.poja_big_sum_std22106.PojaGenerated;
import java.io.File;
import java.util.function.Function;
import lombok.SneakyThrows;
import org.apache.tika.Tika;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@PojaGenerated
@Component
public class FileTyper implements Function<File, MediaType> {

  @SneakyThrows
  @Override
  public MediaType apply(File file) {
    var tika = new Tika();
    String detectedMediaType = tika.detect(file);
    return parseMediaType(detectedMediaType);
  }
}
