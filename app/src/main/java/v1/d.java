package V1;

import J1.k;
import android.util.Log;
import d2.AbstractC5699a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements k {
    @Override // J1.k
    public J1.c b(J1.h hVar) {
        return J1.c.SOURCE;
    }

    @Override // J1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(L1.c cVar, File file, J1.h hVar) {
        try {
            AbstractC5699a.f(((c) cVar.get()).c(), file);
            return true;
        } catch (IOException e8) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e8);
            }
            return false;
        }
    }
}
