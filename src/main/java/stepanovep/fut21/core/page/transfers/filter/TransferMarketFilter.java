package stepanovep.fut21.core.page.transfers.filter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class TransferMarketFilter {

    @Nullable
    private final String name;
    @Nullable
    private final Quality quality;
    @Nullable
    private final Position position;
    @Nullable
    private final ChemStyle chemStyle;
    @Nullable
    private final Integer bidMin;
    @Nullable
    private final Integer bidMax;
    @Nullable
    private final Integer buyNowMin;
    @Nullable
    private final Integer buyNowMax;

    private TransferMarketFilter(@Nullable String name,
                                 @Nullable Quality quality,
                                 @Nullable Position position,
                                 @Nullable ChemStyle chemStyle,
                                 @Nullable Integer bidMin, @Nullable Integer bidMax,
                                 @Nullable Integer buyNowMin, @Nullable Integer buyNowMax) {
        this.name = name;
        this.quality = quality;
        this.position = position;
        this.chemStyle = chemStyle;
        this.bidMin = bidMin;
        this.bidMax = bidMax;
        this.buyNowMin = buyNowMin;
        this.buyNowMax = buyNowMax;
    }

    @Nonnull
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    @Nonnull
    public Optional<Quality> getQuality() {
        return Optional.ofNullable(quality);
    }

    @Nonnull
    public Optional<Position> getPosition() {
        return Optional.ofNullable(position);
    }

    @Nonnull
    public Optional<ChemStyle> getChemStyle() {
        return Optional.ofNullable(chemStyle);
    }

    @Nonnull
    public Optional<Integer> getBidMin() {
        return Optional.ofNullable(bidMin);
    }

    @Nonnull
    public Optional<Integer> getBidMax() {
        return Optional.ofNullable(bidMax);
    }

    @Nonnull
    public Optional<Integer> getBuyNowMin() {
        return Optional.ofNullable(buyNowMin);
    }

    @Nonnull
    public Optional<Integer> getBuyNowMax() {
        return Optional.of(buyNowMax);
    }

    @Override
    public String toString() {
        return "TransferMarketFilter{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                ", position=" + position +
                ", chemStyle=" + chemStyle +
                ", bidMin=" + bidMin +
                ", bidMax=" + bidMax +
                ", buyNowMin=" + buyNowMin +
                ", buyNowMax=" + buyNowMax +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private Quality quality;
        private Position position;
        private ChemStyle chemStyle;
        private Integer bidMin;
        private Integer bidMax;
        private Integer buyNowMin;
        private Integer buyNowMax;

        private Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withQuality(Quality quality) {
            this.quality = quality;
            return this;
        }

        public Builder withPosition(Position position) {
            this.position = position;
            return this;
        }

        public Builder withChemStyle(ChemStyle chemStyle) {
            this.chemStyle = chemStyle;
            return this;
        }

        public Builder withBidMin(Integer bidMin) {
            this.bidMin = bidMin;
            return this;
        }

        public Builder withBidMax(Integer bidMax) {
            this.bidMax = bidMax;
            return this;
        }

        public Builder withBuyNowMin(Integer buyNowMin) {
            this.buyNowMin = buyNowMin;
            return this;
        }

        public Builder withBuyNowMax(Integer buyNowMax) {
            this.buyNowMax = buyNowMax;
            return this;
        }

        public TransferMarketFilter build() {
            return new TransferMarketFilter(name, quality, position, chemStyle, bidMin, bidMax, buyNowMin, buyNowMax);
        }
    }
}
