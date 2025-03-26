package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36752o;

    /* renamed from: s, reason: collision with root package name */
    private final int f36753s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalHeaderNameException(String str, int i8) {
        super("Header name '" + str + "' contains illegal character '" + str.charAt(i8) + "' (code " + (str.charAt(i8) & 255) + ')');
        r.e(str, "headerName");
        this.f36752o = str;
        this.f36753s = i8;
    }
}
