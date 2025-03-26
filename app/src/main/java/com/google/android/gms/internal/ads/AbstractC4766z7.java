package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4766z7 implements A7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f28301b = Logger.getLogger(AbstractC4766z7.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal f28302a = new C4657y7(this);

    @Override // com.google.android.gms.internal.ads.A7
    public final D7 a(Px0 px0, F7 f72) {
        int s02;
        long a8;
        long zzb = px0.zzb();
        ((ByteBuffer) this.f28302a.get()).rewind().limit(8);
        do {
            s02 = px0.s0((ByteBuffer) this.f28302a.get());
            if (s02 == 8) {
                ((ByteBuffer) this.f28302a.get()).rewind();
                long e8 = C7.e((ByteBuffer) this.f28302a.get());
                byte[] bArr = null;
                if (e8 < 8 && e8 > 1) {
                    Logger logger = f28301b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e8);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f28302a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (e8 == 1) {
                        ((ByteBuffer) this.f28302a.get()).limit(16);
                        px0.s0((ByteBuffer) this.f28302a.get());
                        ((ByteBuffer) this.f28302a.get()).position(8);
                        a8 = C7.f((ByteBuffer) this.f28302a.get()) - 16;
                    } else {
                        a8 = e8 == 0 ? px0.a() - px0.zzb() : e8 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f28302a.get()).limit(((ByteBuffer) this.f28302a.get()).limit() + 16);
                        px0.s0((ByteBuffer) this.f28302a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.f28302a.get()).position() - 16; position < ((ByteBuffer) this.f28302a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.f28302a.get()).position() - 16)] = ((ByteBuffer) this.f28302a.get()).get(position);
                        }
                        a8 -= 16;
                    }
                    long j8 = a8;
                    D7 b8 = b(str, bArr, f72 instanceof D7 ? ((D7) f72).zza() : "");
                    ((ByteBuffer) this.f28302a.get()).rewind();
                    b8.d(px0, (ByteBuffer) this.f28302a.get(), j8, this);
                    return b8;
                } catch (UnsupportedEncodingException e9) {
                    throw new RuntimeException(e9);
                }
            }
        } while (s02 >= 0);
        px0.b(zzb);
        throw new EOFException();
    }

    public abstract D7 b(String str, byte[] bArr, String str2);
}
