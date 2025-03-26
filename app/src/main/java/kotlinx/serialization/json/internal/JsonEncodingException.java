package kotlinx.serialization.json.internal;

import J6.r;

/* loaded from: classes2.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str);
        r.e(str, "message");
    }
}
