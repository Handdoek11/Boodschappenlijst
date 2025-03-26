package kotlinx.serialization.json.internal;

import J6.r;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        r.e(str, "message");
    }
}
