package androidx.compose.foundation.gestures;

import J6.AbstractC0650j;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? null : str);
    }
}
