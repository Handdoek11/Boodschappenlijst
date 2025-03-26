package io.ktor.websocket;

import R5.a;
import U6.G;

/* loaded from: classes2.dex */
public final class FrameTooBigException extends Exception implements G {

    /* renamed from: o, reason: collision with root package name */
    private final long f36986o;

    public FrameTooBigException(long j8) {
        this.f36986o = j8;
    }

    @Override // U6.G
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameTooBigException a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.f36986o);
        a.a(frameTooBigException, this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Frame is too big: " + this.f36986o;
    }
}
