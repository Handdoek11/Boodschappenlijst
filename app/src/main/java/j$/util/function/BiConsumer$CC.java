package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.t;
import java.util.function.BiConsumer;

/* renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }
}
