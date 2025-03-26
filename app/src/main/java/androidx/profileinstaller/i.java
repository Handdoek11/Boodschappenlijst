package androidx.profileinstaller;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f10748a = {48, 49, 53, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f10749b = {48, 49, 48, 0};

    /* renamed from: c, reason: collision with root package name */
    static final byte[] f10750c = {48, 48, 57, 0};

    /* renamed from: d, reason: collision with root package name */
    static final byte[] f10751d = {48, 48, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    static final byte[] f10752e = {48, 48, 49, 0};

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f10753f = {48, 48, 49, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f10754g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f10752e) || Arrays.equals(bArr, f10751d)) ? ":" : "!";
    }
}
