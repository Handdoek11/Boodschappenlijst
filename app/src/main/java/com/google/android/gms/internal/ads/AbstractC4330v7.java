package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4330v7 extends U6 {

    /* renamed from: D, reason: collision with root package name */
    private final Object f27194D;

    /* renamed from: E, reason: collision with root package name */
    private final X6 f27195E;

    public AbstractC4330v7(int i8, String str, X6 x62, W6 w62) {
        super(i8, str, w62);
        this.f27194D = new Object();
        this.f27195E = x62;
    }

    protected void E(String str) {
        X6 x62;
        synchronized (this.f27194D) {
            x62 = this.f27195E;
        }
        x62.a(str);
    }

    @Override // com.google.android.gms.internal.ads.U6
    protected final Y6 k(R6 r62) {
        String str;
        String str2;
        try {
            byte[] bArr = r62.f18605b;
            Map map = r62.f18606c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i8 = 1;
                while (true) {
                    if (i8 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i8].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i8++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(r62.f18605b);
        }
        return Y6.b(str, AbstractC3459n7.b(r62));
    }
}
