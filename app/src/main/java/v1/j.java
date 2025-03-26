package V1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class j implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final List f5554a;

    /* renamed from: b, reason: collision with root package name */
    private final J1.j f5555b;

    /* renamed from: c, reason: collision with root package name */
    private final M1.b f5556c;

    public j(List list, J1.j jVar, M1.b bVar) {
        this.f5554a = list;
        this.f5555b = jVar;
        this.f5556c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e8) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e8);
            return null;
        }
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(InputStream inputStream, int i8, int i9, J1.h hVar) {
        byte[] e8 = e(inputStream);
        if (e8 == null) {
            return null;
        }
        return this.f5555b.a(ByteBuffer.wrap(e8), i8, i9, hVar);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, J1.h hVar) {
        return !((Boolean) hVar.c(i.f5553b)).booleanValue() && com.bumptech.glide.load.a.f(this.f5554a, inputStream, this.f5556c) == ImageHeaderParser.ImageType.GIF;
    }
}
