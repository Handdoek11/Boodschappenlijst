package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5476b {
    private static byte[] a(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i8) {
            return bArr;
        }
        int length = i8 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i8 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j8) {
        return new a(inputStream, j8);
    }

    private static int c(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue queue, int i8) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i8) * 2));
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = inputStream.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return a(queue, i8);
                }
                i9 += read;
                i8 += read;
            }
            min = c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    private static final class a extends FilterInputStream {

        /* renamed from: o, reason: collision with root package name */
        private long f32936o;

        /* renamed from: s, reason: collision with root package name */
        private long f32937s;

        a(InputStream inputStream, long j8) {
            super(inputStream);
            this.f32937s = -1L;
            this.f32936o = j8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f32936o);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i8) {
            ((FilterInputStream) this).in.mark(i8);
            this.f32937s = this.f32936o;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f32936o == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f32936o--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f32937s == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f32936o = this.f32937s;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f32936o));
            this.f32936o -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            long j8 = this.f32936o;
            if (j8 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
            if (read != -1) {
                this.f32936o -= read;
            }
            return read;
        }
    }
}
