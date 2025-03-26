package io.ktor.utils.io;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class ClosedWriteChannelException extends CancellationException {
    public ClosedWriteChannelException(String str) {
        super(str);
    }
}
