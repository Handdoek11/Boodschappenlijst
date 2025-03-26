package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36754o;

    /* renamed from: s, reason: collision with root package name */
    private final int f36755s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalHeaderValueException(String str, int i8) {
        super("Header value '" + str + "' contains illegal character '" + str.charAt(i8) + "' (code " + (str.charAt(i8) & 255) + ')');
        r.e(str, "headerValue");
        this.f36754o = str;
        this.f36755s = i8;
    }
}
