package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2201bc {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f20899a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f20900b = new Base64OutputStream(this.f20899a, 10);

    public final String toString() {
        String str;
        try {
            this.f20900b.close();
        } catch (IOException e8) {
            H2.p.e("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            try {
                this.f20899a.close();
                str = this.f20899a.toString();
            } catch (IOException e9) {
                H2.p.e("HashManager: Unable to convert to Base64.", e9);
                str = "";
            }
            return str;
        } finally {
            this.f20899a = null;
            this.f20900b = null;
        }
    }
}
