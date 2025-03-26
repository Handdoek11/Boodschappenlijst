package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f18584a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f18585b;

    public R1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f18584a = byteArrayOutputStream;
        this.f18585b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(Q1 q12) {
        this.f18584a.reset();
        try {
            b(this.f18585b, q12.f18342o);
            String str = q12.f18343s;
            if (str == null) {
                str = "";
            }
            b(this.f18585b, str);
            this.f18585b.writeLong(q12.f18344t);
            this.f18585b.writeLong(q12.f18345u);
            this.f18585b.write(q12.f18346v);
            this.f18585b.flush();
            return this.f18584a.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
