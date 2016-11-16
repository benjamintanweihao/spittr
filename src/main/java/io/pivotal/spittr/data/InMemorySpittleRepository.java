package io.pivotal.spittr.data;

import io.pivotal.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class InMemorySpittleRepository implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }

        return spittles;
    }

    @Override
    public Spittle findOne(long spittleId) {
        return new Spittle("Spittle " + spittleId, new Date());
    }
}
