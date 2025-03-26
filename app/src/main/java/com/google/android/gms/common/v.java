package com.google.android.gms.common;

import Z2.U;
import Z2.x0;
import android.os.RemoteException;
import android.util.Log;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class v extends x0 {

    /* renamed from: o, reason: collision with root package name */
    private final int f13428o;

    protected v(byte[] bArr) {
        Z2.r.a(bArr.length == 25);
        this.f13428o = Arrays.hashCode(bArr);
    }

    protected static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // Z2.U
    public final int a() {
        return this.f13428o;
    }

    @Override // Z2.U
    public final InterfaceC5852a d() {
        return BinderC5853b.p2(p2());
    }

    public final boolean equals(Object obj) {
        InterfaceC5852a d8;
        if (obj != null && (obj instanceof U)) {
            try {
                U u7 = (U) obj;
                if (u7.a() == this.f13428o && (d8 = u7.d()) != null) {
                    return Arrays.equals(p2(), (byte[]) BinderC5853b.J0(d8));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13428o;
    }

    abstract byte[] p2();
}
