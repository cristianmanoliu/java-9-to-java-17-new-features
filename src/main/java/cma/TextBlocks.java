package cma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextBlocks {
  private static final Logger LOGGER = LoggerFactory.getLogger(TextBlocks.class);

  public void test(){
    String textBlock = """
           <!DOCTYPE html>
                        <html>
                            <head>
                                <title>Example</title>
                            </head>
                            <body>
                                <p>This is an example of a simple HTML
                                page with one paragraph.</p>
                            </body>
                        </html>
        """;
    LOGGER.info("Got textBlock: {}", textBlock);
  }

}
