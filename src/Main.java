import arrayshashing.EncodeAndDecodeStringsSolution;
import arrayshashing.GroupAnagramsSolution;
import arrayshashing.TopKFrequentElementsSolution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EncodeAndDecodeStringsSolution encodeAndDecodeStringsSolution = new EncodeAndDecodeStringsSolution();
        System.out.println(encodeAndDecodeStringsSolution.decode(encodeAndDecodeStringsSolution.encode(List.of("Hello","World"))));
    }
}