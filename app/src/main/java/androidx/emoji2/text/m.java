package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class m {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f9691a;

        a(ByteBuffer byteBuffer) {
            this.f9691a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() {
            return this.f9691a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i8) {
            ByteBuffer byteBuffer = this.f9691a;
            byteBuffer.position(byteBuffer.position() + i8);
        }

        @Override // androidx.emoji2.text.m.c
        public long c() {
            return m.c(this.f9691a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long d() {
            return this.f9691a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f9691a.getShort());
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f9692a;

        /* renamed from: b, reason: collision with root package name */
        private final long f9693b;

        b(long j8, long j9) {
            this.f9692a = j8;
            this.f9693b = j9;
        }

        long a() {
            return this.f9692a;
        }
    }

    private interface c {
        int a();

        void b(int i8);

        long c();

        long d();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j8;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i8 = 0;
        while (true) {
            if (i8 >= readUnsignedShort) {
                j8 = -1;
                break;
            }
            int a8 = cVar.a();
            cVar.b(4);
            j8 = cVar.c();
            cVar.b(4);
            if (1835365473 == a8) {
                break;
            }
            i8++;
        }
        if (j8 != -1) {
            cVar.b((int) (j8 - cVar.d()));
            cVar.b(12);
            long c8 = cVar.c();
            for (int i9 = 0; i9 < c8; i9++) {
                int a9 = cVar.a();
                long c9 = cVar.c();
                long c10 = cVar.c();
                if (1164798569 == a9 || 1701669481 == a9) {
                    return new b(c9 + j8, c10);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static M0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return M0.b.h(duplicate);
    }

    static long c(int i8) {
        return i8 & 4294967295L;
    }

    static int d(short s8) {
        return s8 & 65535;
    }
}
