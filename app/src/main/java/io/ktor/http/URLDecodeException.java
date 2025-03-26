package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class URLDecodeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLDecodeException(String str) {
        super(str);
        r.e(str, "message");
    }
}
