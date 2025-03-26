package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class URLParserException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLParserException(String str, Throwable th) {
        super("Fail to parse url: " + str, th);
        r.e(str, "urlString");
        r.e(th, "cause");
    }
}
