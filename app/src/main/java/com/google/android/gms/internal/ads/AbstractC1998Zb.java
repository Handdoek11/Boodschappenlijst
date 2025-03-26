package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1998Zb {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f20507b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f20508a = new Object();

    protected final MessageDigest a() {
        synchronized (this.f20508a) {
            MessageDigest messageDigest = f20507b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i8 = 0; i8 < 2; i8++) {
                try {
                    f20507b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f20507b;
        }
    }

    abstract byte[] b(String str);
}
