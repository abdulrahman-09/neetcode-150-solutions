package arrayshashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStringsSolution {
    public String encode(List<String> strs) {
        if(strs.size() == 0)
            return "";
        StringBuilder metadata = new StringBuilder();
        StringBuilder payload = new StringBuilder();
        int wordLen;
        for (String str : strs){
            wordLen = str.length();
            metadata.append(wordLen).append('.');
            payload.append(str);
        }
        return metadata.length() + "." + metadata.append(payload).toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty())
            return List.of();
        int i = str.indexOf('.');
        int metadataLen = Integer.valueOf(str.substring(0, i));
        int payloadStart = i + 1 + metadataLen;
        String metadata = str.substring(i + 1, payloadStart);
        String[] wordsMetadata = metadata.split("\\.");
        List<String> res = new ArrayList<>();
        int idx = payloadStart;
        for (String wordLen : wordsMetadata){
            int len = Integer.valueOf(wordLen);
            res.add(str.substring(idx, idx + len));
            idx += len;
        }
        return res;
    }
}
