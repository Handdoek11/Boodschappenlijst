package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class a implements l {

    /* renamed from: o, reason: collision with root package name */
    protected int f33070o = 0;

    UninitializedMessageException a() {
        return new UninitializedMessageException(this);
    }

    public byte[] d() {
        try {
            byte[] bArr = new byte[b()];
            CodedOutputStream y7 = CodedOutputStream.y(bArr);
            f(y7);
            y7.a();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e8);
        }
    }

    public void e(OutputStream outputStream) {
        int b8 = b();
        CodedOutputStream x7 = CodedOutputStream.x(outputStream, CodedOutputStream.n(CodedOutputStream.o(b8) + b8));
        x7.W(b8);
        f(x7);
        x7.v();
    }

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0243a implements m, Cloneable {
        protected static UninitializedMessageException h(l lVar) {
            return new UninitializedMessageException(lVar);
        }

        /* renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0244a extends FilterInputStream {

            /* renamed from: o, reason: collision with root package name */
            private int f33071o;

            C0244a(InputStream inputStream, int i8) {
                super(inputStream);
                this.f33071o = i8;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f33071o);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f33071o <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f33071o--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j8) {
                long skip = super.skip(Math.min(j8, this.f33071o));
                if (skip >= 0) {
                    this.f33071o = (int) (this.f33071o - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) {
                int i10 = this.f33071o;
                if (i10 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i8, Math.min(i9, i10));
                if (read >= 0) {
                    this.f33071o -= read;
                }
                return read;
            }
        }
    }
}
