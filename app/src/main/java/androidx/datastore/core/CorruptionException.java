package androidx.datastore.core;

import J6.AbstractC0650j;
import J6.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i8, AbstractC0650j abstractC0650j) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th) {
        super(str, th);
        r.e(str, "message");
    }
}
