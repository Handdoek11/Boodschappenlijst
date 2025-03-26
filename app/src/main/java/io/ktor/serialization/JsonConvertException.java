package io.ktor.serialization;

import J6.r;

/* loaded from: classes2.dex */
public final class JsonConvertException extends ContentConvertException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonConvertException(String str, Throwable th) {
        super(str, th);
        r.e(str, "message");
    }
}
