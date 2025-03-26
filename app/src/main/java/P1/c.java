package P1;

import android.util.Log;
import d2.AbstractC5699a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements J1.d {
    @Override // J1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, File file, J1.h hVar) {
        try {
            AbstractC5699a.f(byteBuffer, file);
            return true;
        } catch (IOException e8) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e8);
            }
            return false;
        }
    }
}
