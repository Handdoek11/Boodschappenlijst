package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5947h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC5947h onClose(Runnable runnable);

    InterfaceC5947h parallel();

    InterfaceC5947h sequential();

    Spliterator spliterator();

    InterfaceC5947h unordered();
}
