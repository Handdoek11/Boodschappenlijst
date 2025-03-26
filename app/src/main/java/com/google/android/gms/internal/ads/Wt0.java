package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Wt0 implements InterfaceC3871qv0 {
    protected int zzq = 0;

    protected static void j(Iterable iterable, List list) {
        Vt0.p(iterable, list);
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    abstract int a();

    abstract int e(Iv0 iv0);

    public AbstractC3542nu0 g() {
        try {
            int f8 = f();
            AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
            byte[] bArr = new byte[f8];
            C4413vu0 c4413vu0 = new C4413vu0(bArr, 0, f8);
            h(c4413vu0);
            c4413vu0.g();
            return new C3215ku0(bArr);
        } catch (IOException e8) {
            throw new RuntimeException(n("ByteString"), e8);
        }
    }

    zzhag i() {
        return new zzhag(this);
    }

    abstract void k(int i8);

    public void l(OutputStream outputStream) {
        C4522wu0 c4522wu0 = new C4522wu0(outputStream, AbstractC4740yu0.c(f()));
        h(c4522wu0);
        c4522wu0.j();
    }

    public byte[] m() {
        try {
            int f8 = f();
            byte[] bArr = new byte[f8];
            C4413vu0 c4413vu0 = new C4413vu0(bArr, 0, f8);
            h(c4413vu0);
            c4413vu0.g();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(n("byte array"), e8);
        }
    }
}
