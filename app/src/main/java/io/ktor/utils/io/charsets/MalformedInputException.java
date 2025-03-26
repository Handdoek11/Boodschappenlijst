package io.ktor.utils.io.charsets;

import J6.r;

/* loaded from: classes2.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36861o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedInputException(String str) {
        super(0);
        r.e(str, "message");
        this.f36861o = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public String getMessage() {
        return this.f36861o;
    }
}
